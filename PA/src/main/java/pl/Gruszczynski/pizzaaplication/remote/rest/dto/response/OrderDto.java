package pl.Gruszczynski.pizzaaplication.remote.rest.dto.response;

import pl.Gruszczynski.pizzaaplication.domain.model.OrderStatusType;
import pl.Gruszczynski.pizzaaplication.remote.rest.dto.request.PersonOrderDto;
import pl.Gruszczynski.pizzaaplication.remote.rest.dto.request.PizzaOrderDto;

import java.util.List;

public class OrderDto {
    private Integer id;
    private OrderStatusType status;
    private List<PizzaOrderDto> pizzas;
    private PersonOrderDto person;

    public OrderDto() {

    }

    public OrderDto(Integer id, OrderStatusType status, List<PizzaOrderDto> pizzas, List<PersonOrderDto> persons) {
        this.id = id;
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public List<PizzaOrderDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }

    public PersonOrderDto getPerson()
    {
        return person;
    }

    public void setPerson(PersonOrderDto person)
    {
        this.person = person;
    }
}


