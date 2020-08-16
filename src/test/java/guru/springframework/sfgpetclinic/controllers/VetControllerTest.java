package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.fauxspring.Model;
import guru.springframework.sfgpetclinic.fauxspring.ModelMapImpl;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.SpecialityMapService;
import guru.springframework.sfgpetclinic.services.map.VetMapService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class VetControllerTest {

    VetController vetController;
    VetService vetService;
    SpecialtyService specialtyService;

    @BeforeEach
    void setUp() {
        specialtyService = new SpecialityMapService();
        vetService = new VetMapService(specialtyService);
        vetController = new VetController(vetService);

        Vet vet1  = new Vet(1l, "Joe", "Biden", new HashSet<>());
        Vet vet2  = new Vet(2l, "Kamla", "Harris", new HashSet<>());

        vetService.save(vet1);
        vetService.save(vet2);

    }

    @Test
    void listVets() {
        Model model =  new ModelMapImpl();
        String result = vetController.listVets(model);
        assertEquals("vets/index",result);

        Set set = (Set) ((ModelMapImpl)model).getMap().get("vets");

        assertEquals(2, set.size());
    }
}