package com.glowbyte.from8to17.scaled_class;

sealed class Shape permits Circle, Rectangle {
	private String name;
}
