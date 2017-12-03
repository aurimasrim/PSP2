/**
 * @(#) LecturerFactory.java
 */

package com.university.domain.people.entity;

public class LecturerFactory implements IPersonFactory
{
    public IPerson createPerson( String name, IPersonContacts contacts )
    {
        return new Lecturer(name, contacts);
    }

    public IPersonContacts createPersonContacts( String email, String phone )
    {
        return new LecturerContacts(email, phone);
    }
}
