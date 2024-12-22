package com.example;

import com.example.config.AppConfig;
import com.example.dao.CustomerDao;
import com.example.entity.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerDao customerDao = context.getBean(CustomerDao.class);

        Customer customer = new Customer("Настюша Сметанюк", "anastasiiasmet @example.com", "123-45-6789");

        customerDao.addCustomer(customer);

        System.out.println("Клиент добавлен: " + customer.getFullName());
    }
}