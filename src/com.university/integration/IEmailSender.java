/**
 * @(#) IEmailSender.java
 */

package com.university.integration;

public interface IEmailSender
{
	void send( String email, String title, String text );
}
