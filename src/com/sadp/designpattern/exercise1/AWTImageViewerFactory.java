package com.sadp.designpattern.exercise1;

public class AWTImageViewerFactory implements ImageViewerFactory {

	@Override
	public void drawImage() {
		System.out.println("AWT Image Viewer");
	}

}
