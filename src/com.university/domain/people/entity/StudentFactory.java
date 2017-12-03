/**
 * @(#) StudentFactory.java
 */

package com.university.domain.people.entity;

public class StudentFactory implements IPersonFactory
{
    public IPerson createPerson( String name, IPersonContacts contacts )
    {
        return new Student(name, contacts);
    }

    public IPersonContacts createPersonContacts( String email, String phone )
    {
        return new StudentContacts(email, phone);
    }
}
