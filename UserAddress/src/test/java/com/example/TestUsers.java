package com.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestUsers {

    @Test
    public void testUsers()
    {
        Address address1 = new Address("Ukraine", "Lviv", "Naukova", 50);
        User user = new User("Ivanov", "Ivan", address1);
        Address address2 = new Address("Ukraine", "Kyiv", "Shevchenka", 10);
        user.setAddress(address2);

        Assertions.assertEquals(address2, user.getAddress());
        Assertions.assertEquals("Kyiv",  user.getAddress().getCity());
    }
}
