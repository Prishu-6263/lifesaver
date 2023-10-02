package com.example.lifesaver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lifesaver.model.BloodRegistration;
import com.example.lifesaver.repository.LifeSaverRepository;
@Service
public class LifeSaverService {
	   @Autowired
	    private LifeSaverRepository lifeSaverRepository;

	    public List<BloodRegistration> findAll() {
	        return lifeSaverRepository.findAll();
	    }

	    public BloodRegistration findById(Long id) {
	        return lifeSaverRepository.findById(id).orElse(null);
	    }

	    public void save(BloodRegistration submit) {
	        lifeSaverRepository.save(submit);
	    }

	    public void delete(Long id) {
	       lifeSaverRepository.deleteById(id);
	    }
	}


