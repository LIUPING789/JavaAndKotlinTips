package com.knight.mykotlinfirst.samples8;

import java.util.Objects;

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/9 on 17:56
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/9 on 17:56
 * version: v 1.0
 */
public class JavaExample8 {

    public static class User {
        private String name;
        private int age;
        private int gender;
        private String address;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    ", address='" + address + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return age == user.age &&
                    gender == user.gender &&
                    Objects.equals(name, user.name) &&
                    Objects.equals(address, user.address);
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + age;
            result = 31 * result + gender;
            result = 31 * result + (address != null ? address.hashCode() : 0);
            return result;
        }
    }
}
