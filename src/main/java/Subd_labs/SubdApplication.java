package Subd_labs;

import Subd_labs.entity.*;
import Subd_labs.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import javax.persistence.Convert;
import javax.persistence.Converter;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SubdApplication {

	private ClientsRepository clientsRepository;

	private DoneworkRepository doneworkRepository;

	private FirmRepository firmRepository;

	private CostsRepository costsRepository;

	private OrdersRepository ordersRepository;

	private PostRepository postRepository;

	private StaffRepository staffRepository;

	@Autowired
	public SubdApplication(ClientsRepository clientsRepository,
						   CostsRepository costsRepository,
						   DoneworkRepository doneworkRepository,
						   FirmRepository firmRepository,
						   OrdersRepository ordersRepository,
						   PostRepository postRepository,
						   StaffRepository staffRepository){
		this.clientsRepository=clientsRepository;
		this.firmRepository=firmRepository;
		this.doneworkRepository=doneworkRepository;
		this.costsRepository=costsRepository;
		this.ordersRepository=ordersRepository;
		this.postRepository=postRepository;
		this.staffRepository=staffRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SubdApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void onStart() {
		//SecondRequest();
		//FirstRequest();
		ThirdRequest();
		//readCosts();
		//readClients();
		//readDoneWork();
		//readFirms();
		//readOrders();
		//readPost();
		//readStaff();
	}
	public void FirstRequest() {
		Timestamp start = new Timestamp(System.currentTimeMillis());
		List<CostsTypeworkSum> resultFirst = costsRepository.getAllTypeWorkSums();
		Timestamp end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

		resultFirst.forEach(CostsTypeworkSum -> {
			System.out.print("Название работы: " + CostsTypeworkSum.getTypeworkName() + " ");
			System.out.println("Цена: " + CostsTypeworkSum.getSumprices());
		});
	}
	public void SecondRequest(){
		Timestamp start = new Timestamp(System.currentTimeMillis());
		List<GetAllTypeWork> resultSecond = costsRepository.getAllTypeWork();
		Timestamp end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

		resultSecond.forEach(GetAllTypeWork -> {
			System.out.println("Название работы: " + GetAllTypeWork.getNameTypeWork() + " ");
		});
	}
	public void ThirdRequest(){
		Date date = new Date(System.currentTimeMillis()-2592000000L);
		Timestamp start = new Timestamp(System.currentTimeMillis());
		List<LastMonthRecord> resultThird = ordersRepository.findDate(date);
		Timestamp end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

		resultThird.forEach(LastMonthRecord -> {
			System.out.print("Id: " + LastMonthRecord.getId() + " ");
			System.out.println("Дата: " + LastMonthRecord.getDate());
			System.out.println("Имя: " + LastMonthRecord.getFirstName());
			System.out.println("Фамилия: " + LastMonthRecord.getLastName());
		});
	}

	private void createStaff(String post, String name, String surname, String patronymic, BigInteger phonenum) {
	Staff staff = new Staff();
	staff.Construct(null,name,surname, patronymic,phonenum);
	staffRepository.save(staff);
	}

	private void deleteStaff() {
		staffRepository.deleteById(5);
	}
	private void updateStaff(Integer id,String post, String name,String surname,String patronymic, BigInteger phonenum) {
		Staff staff = new Staff();
		staff.Construct(id,name,surname, patronymic,phonenum);
		staffRepository.save(staff);
	}

	private void readCosts() {
		costsRepository.findAll(PageRequest.of(0, 3, Sort.Direction.DESC, "typework"))
				.toList()
				.forEach(System.out::println);
	}

	private void readClients() {
		clientsRepository.findAll(PageRequest.of(0, 2, Sort.Direction.DESC, "surname"))
				.toList()
				.forEach(System.out::println);
	}

	private void readDoneWork() {
		doneworkRepository.findAll(PageRequest.of(0, 2, Sort.Direction.DESC, "price"))
				.toList()
				.forEach(System.out::println);
	}

	private void readFirms() {
		firmRepository.findAll(PageRequest.of(0, 2, Sort.Direction.DESC, "address"))
				.toList()
				.forEach(System.out::println);
	}

	private void readOrders(){
		ordersRepository.findAll(PageRequest.of(0, 2, Sort.Direction.DESC, "date"))
				.toList()
				.forEach(System.out::println);
	}

	private void readPost(){
		postRepository.findAll(PageRequest.of(0, 2, Sort.Direction.DESC, "postname"))
				.toList()
				.forEach(System.out::println);
	}

	private void readStaff(){
		staffRepository.findAll(PageRequest.of(0, 2, Sort.Direction.DESC, "name"))
				.toList()
				.forEach(System.out::println);
	}
}