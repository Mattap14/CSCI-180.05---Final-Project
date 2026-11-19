package app.rest.controllers;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.components.OrderManager;
import app.entity.OrderItem;

@Component
@Path("/orderitem")
public class OrderItemController {
	
	@Autowired
	private OrderManager om;
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<OrderItem> getOrderItems(@QueryParam("orderPk") Long orderPk) {
		return om.getAllOrderItems(orderPk);
	}

}
