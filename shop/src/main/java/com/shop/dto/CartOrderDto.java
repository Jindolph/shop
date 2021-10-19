package com.shop.dto;

import lombok.Setter;

import java.util.List;

import lombok.Getter;

@Getter
@Setter
public class CartOrderDto {

	private Long cartItemId;

	private List<CartOrderDto> cartOrderDtoList;
}
