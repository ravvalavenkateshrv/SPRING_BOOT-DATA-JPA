package com.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.entity.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {

}
