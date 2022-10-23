package com.example.taco.controller;

import com.example.taco.data.Ingredient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@Slf4j
@RequestMapping("/design")
public class DesignTacoController {

    @GetMapping
    public String showDesingForm(Model model){

        List<Ingredient> ingredients = Arrays.asList((
                new Ingredient()
                ))
    }





}
