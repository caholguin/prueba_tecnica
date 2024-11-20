package com.prueba.pruebasrping.service.impl;

import com.prueba.pruebasrping.dto.request.FibonacciDTO;
import com.prueba.pruebasrping.dto.request.SaveFibonacciDTO;
import com.prueba.pruebasrping.entity.Fibonacci;
import com.prueba.pruebasrping.mapper.FibonacciMapper;
import com.prueba.pruebasrping.repository.FibonacciRespository;
import com.prueba.pruebasrping.service.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
public class FibonacciServiceImpl implements FibonacciService {

    @Autowired
    private FibonacciRespository fibonacciRespository;

    @Autowired
    private JavaMailSender mailSender;


    @Override
    public List<FibonacciDTO> getAll(){
        List<Fibonacci> fibonaccis = fibonacciRespository.findAll();
        return FibonacciMapper.toDtoList(fibonaccis);
    }

    @Override
    public List<Integer> generateDescendingFibonacci(){

        LocalTime now = LocalTime.now();
        return generateFibonacciWithTime(now);
    }

    @Override
    public List<Integer> generateDescendingFibonacciWithData(SaveFibonacciDTO saveFibonacciDTO){
        LocalTime data = saveFibonacciDTO.getData();
        return generateFibonacciWithTime(data);
    }

    private List<Integer> generateFibonacciWithTime(LocalTime time){

        int x = time.getMinute() / 10;
        int y = time.getMinute() % 10;

        int count = time.getSecond();

        List<Integer> fibonacci = generateFibonacci(x, y, count);

        fibonacci.addFirst(y);
        fibonacci.addFirst(x);

        Collections.reverse(fibonacci);


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fibonacci.size(); i++) {
            sb.append(fibonacci.get(i));
            if (i < fibonacci.size() - 1) {
                sb.append(",");
            }
        }

        Fibonacci fibonacciDb = new Fibonacci();
        fibonacciDb.setFibonacci(sb.toString());
        fibonacciRespository.save(fibonacciDb);


        List<String> recipients = new ArrayList<>();
        recipients.add("didier.correa@proteccion.com.co");
        recipients.add("correalondon@gmail.com");
        recipients.add("caholguin179@gmail.com");

        sendEmail(recipients, "prueba ",sb.toString());

        return fibonacci;
    }

    private List<Integer> generateFibonacci(int x, int y, int count){
        List<Integer> fibonacci = new ArrayList<>();

        int a = x;
        int b = y;

        for (int i = 0; i < count; i++) {
            int next = a + b;
            fibonacci.add(next);
            a = b;
            b = next;
        }

        return fibonacci;
    }


    public void sendEmail(List<String> toList, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("caholguin179@gmail.com");
        message.setTo(toList.toArray(new String[0]));
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);
    }

}
