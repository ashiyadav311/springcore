package com.springcore.collection;
import java.util.List;
import java.util.Properties;
public class Employee {
        private String Name;
        private int Age;
        private List<String> Number;
        private Properties Address;

        public String getName() {
                return Name;
        }

        public void setName(String name) {
                Name = name;
        }

        public int getAge() {
                return Age;
        }

        public void setAge(int age) {
                Age = age;
        }

        public List<String> getNumber() {
                return Number;
        }

        public void setNumber(List<String> number) {
                Number = number;
        }

        public Properties getAddress() {
                return Address;
        }

        public void setAddress(Properties address) {
                Address = address;
        }

        public Employee(String name, int age, List<String> number, Properties address) {
                Name = name;
                Age = age;
                Number = number;
                Address = address;
        }
        public Employee() {
                super();
        }
}
