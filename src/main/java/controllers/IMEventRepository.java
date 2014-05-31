package controllers;

import org.springframework.data.repository.CrudRepository;

import domain.MEvent;

public interface IMEventRepository extends CrudRepository<MEvent, Integer> {

}
