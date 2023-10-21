package za.ac.cput.repository;

/* IPizzaToppingRepository.java
 Author: Timothy Lombard (220154856)
 Date: 24th July (last updated) 2023

@Repository
public interface IPizzaToppingRepository extends JpaRepository<PizzaTopping, PizzaToppingId> {

    public ArrayList<PizzaTopping> findAllByPizzaIdAndToppingId(Pizza pizzaId, Topping toppingId);

    public void deleteAllByPizzaIdAndToppingId(Pizza pizzaId, Topping toppingId);

}

 */
