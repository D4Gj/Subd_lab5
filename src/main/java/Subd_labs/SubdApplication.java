package Subd_labs;

import Subd_labs.entity.*;
import Subd_labs.repository.*;
import Subd_labs.service.serviceInterfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import Subd_labs.service.implementation.ClientServiceImpl;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SubdApplication {

	private ClientRepository clientRepository;

	private DoneworkRepository doneworkRepository;

	private FirmRepository firmRepository;

	private CostsRepository costsRepository;

	private OrdersRepository ordersRepository;

	private PostRepository postRepository;

	private StaffRepository staffRepository;

	private ClientService clientService;
	private CostsService costsService;
	private DoneworkService doneworkService;
	private FirmService firmService;
	private OrdersService ordersService;
	private PostService postService;
	private StaffService staffService;

	@Autowired
	public SubdApplication(ClientRepository clientRepository, DoneworkRepository doneworkRepository, FirmRepository firmRepository, CostsRepository costsRepository, OrdersRepository ordersRepository, PostRepository postRepository, StaffRepository staffRepository, ClientService clientService, CostsService costsService, DoneworkService doneworkService, FirmService firmService, OrdersService ordersService, PostService postService, StaffService staffService) {
		this.clientRepository = clientRepository;
		this.doneworkRepository = doneworkRepository;
		this.firmRepository = firmRepository;
		this.costsRepository = costsRepository;
		this.ordersRepository = ordersRepository;
		this.postRepository = postRepository;
		this.staffRepository = staffRepository;
		this.clientService = clientService;
		this.costsService = costsService;
		this.doneworkService = doneworkService;
		this.firmService = firmService;
		this.ordersService = ordersService;
		this.postService = postService;
		this.staffService = staffService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SubdApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void onStart() {
		//SecondRequest();
		//FirstRequest();
		//ThirdRequest();
		//System.out.println(clientService.getAll());
		//System.out.println(clientService.getById(1));
		Staff st = new Staff(null,"Viktor","Viktorov","Viktorovich",null);
		staffService.addStaff(st);

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
		List<AllTypeWork> resultSecond = costsRepository.getAllTypeWork();
		Timestamp end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");

		resultSecond.forEach(AllTypeWork -> {
			System.out.println("Название работы: " + AllTypeWork.getNameTypeWork() + " ");
		});
	}
	public void ThirdRequest(){
		long month = 2592000000L;
		Date date = new Date(System.currentTimeMillis()-month);
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
}