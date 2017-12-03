/**
 * @(#) EmailSender.java
 */

package com.university.integration;

public class EmailSender implements IEmailSender
{
	public void send( String email, String title, String text )
	{
		System.out.println("\n Email sent to: " + email + "\nTitle: " + title + "\nText: " + text + "\n");
	}
}
