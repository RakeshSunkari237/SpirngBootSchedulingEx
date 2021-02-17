package com.app.scheduling;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {

	
	public static final DateTimeFormatter dateTimeFormat= DateTimeFormatter.ofPattern("HH:mm:ss");
	
	/**
	 * method is invoked every five seconds 
	 * (measured between the successive start times of each invocation):
	 */
	/*
	 * @Scheduled(fixedRate = 5000) public void reportCurrentTime() {
	 * System.out.println("Fixed Rate Task: Execution time : "+dateTimeFormat.format
	 * (LocalDateTime.now())); }
	 */
	
	
	/**
	 * fixedDelay
		Execute the annotated method with a fixed period in milliseconds between the end of the last invocation and the start of the next.
	 */
	/*
	 * @Scheduled(fixedDelay = 5000) public void reportCurrentTime() {
	 * System.out.println("Fixed Delay Task: Execution time : "+dateTimeFormat.format
	 * (LocalDateTime.now())); }
	 */
	 
	/**
	 * IntialDelay with FixedRate
	 * 
	 * For fixed-delay and fixed-rate tasks, 
	 * we can specify an initial delay by indicating the number of milliseconds 
	 * to wait before the first execution of the method,
	 * 
	 */
	/*
	 * @Scheduled(initialDelay = 1000, fixedRate = 5000) public void
	 * reportCurrentTime() {
	 * System.out.println("Fixed Rate with intialDelay Task: Execution time : "
	 * +dateTimeFormat.format (LocalDateTime.now())); }
	 */	 
	 
	  //@Scheduled(cron="59 59 23 31 12 *")
	  @Scheduled(cron = "0/15 52 10 * * *") 
	  public void reportCurrentTime() {
	  System.out.println("cron expression Task: Execution time : "+dateTimeFormat.format
	  (LocalDateTime.now())); 
	  }
	
	
}
