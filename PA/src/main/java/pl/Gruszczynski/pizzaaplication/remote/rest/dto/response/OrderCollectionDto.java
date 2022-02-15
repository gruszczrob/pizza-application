package pl.Gruszczynski.pizzaaplication.remote.rest.dto.response;

import pl.Gruszczynski.pizzaaplication.domain.model.OrderStatusType;
import pl.Gruszczynski.pizzaaplication.remote.rest.dto.request.PersonOrderDto;

import java.util.List;

public class OrderCollectionDto
{
    private List<OrderDto> orders;

    public OrderCollectionDto()
    {

    }

    public OrderCollectionDto(List<OrderDto> orders)
    {
        this.orders = orders;
    }

    public List<OrderDto> getOrders()
    {
        return orders;
    }

    public void setOrders(List<OrderDto> orders)
    {
        this.orders = orders;
    }
}
