package com.geekster.mapping.service;

import com.geekster.mapping.model.Address;
import com.geekster.mapping.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AddressService {


    @Autowired
    IAddressRepo addressRepo;

    public String saveAddress(Address newAddress) {

        addressRepo.save(newAddress);
        return "added";
    }

    public String updateAddress(Integer id, String addressName) {

        Address add = addressRepo.findById(id).get();
        add.setAddressName(addressName);
        addressRepo.save(add);
        return "updated";
    }

    public List<Address> getAddress() {
        return addressRepo.findAll();
    }

    public String removeAddress(Integer id) {

        addressRepo.deleteById(id);
        return "removed";
    }

    public Address getAddressById(Integer addressId) {
     return    addressRepo.getAddressById(addressId);
    }
}
