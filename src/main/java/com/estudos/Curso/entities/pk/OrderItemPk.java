package com.estudos.Curso.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.estudos.Curso.entities.Order;
import com.estudos.Curso.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPk implements Serializable{
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product prodcut;

	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProdcut() {
		return prodcut;
	}

	public void setProdcut(Product prodcut) {
		this.prodcut = prodcut;
	}

	@Override
	public int hashCode() {
		return Objects.hash(order, prodcut);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPk other = (OrderItemPk) obj;
		return Objects.equals(order, other.order) && Objects.equals(prodcut, other.prodcut);
	}

}
