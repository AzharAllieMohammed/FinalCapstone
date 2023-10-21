package za.ac.cput.controller;

/* PizzaToppingController.java
 Author: Timothy Lombard (220154856)
 Date: 17th June (last updated) 2023

@RestController
@RequestMapping("/pizzatopping")
public class PizzaToppingController {

    @Autowired
    private PizzaToppingService pizzaToppingService;

    @PostMapping("/create")
    public PizzaTopping create(@RequestBody PizzaTopping pizzaTopping){
        return pizzaToppingService.create(pizzaTopping);
    }

    @GetMapping("/read/{pizzaId}/{toppingId}")
    public ArrayList<PizzaTopping> read(@PathVariable Pizza pizzaId, Topping toppingId){
        return pizzaToppingService.readPizzaIdAndToppingId(pizzaId, toppingId);
    }

    @DeleteMapping("/delete/{pizzaId}/{toppingId}")
    public void delete(@PathVariable Pizza pizzaId, Topping toppingId){
         pizzaToppingService.deletePT(pizzaId, toppingId);
    }

    @GetMapping({"/getall"})
    public ArrayList<PizzaTopping> getAll(){
        return pizzaToppingService.getAll();
    }
}

 */
