package com.rodrigorar.creational;

import com.rodrigorar.creational.prototype.Image;
import com.rodrigorar.creational.prototype.ImageHandler;

public class PrototypePattern {
	public static void main(String[] args) {
		ImageHandler handler = ImageHandler.populate();

		Image imageOne = handler.get(ImageHandler.ClassType.IMAGE_ONE);
		System.out.println("Original Of Image 1");
		System.out.print("Id: " + imageOne.getId() + "\nName: " + imageOne.getName() + "\n");
		Image imageOneClone = imageOne.clone();
		System.out.println("Clone Of Image 1");
		System.out.print("Id: " + imageOneClone.getId() + "\nName: " + imageOneClone.getName() + "\n");

		Image imageTwo = handler.get(ImageHandler.ClassType.IMAGE_TWO);
		System.out.println("Original Of Image 2");
		System.out.print("Id: " + imageTwo.getId() + "\nName: " + imageTwo.getName() + "\n");
		Image imageTwoClone = imageTwo.clone();
		System.out.println("Clone Of Image 2");
		System.out.print("Id: " + imageTwoClone.getId() + "\nName: " + imageTwoClone.getName() + "\n");
	}
}
