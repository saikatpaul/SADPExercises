package com.sadp.designpattern.exercise1;

public class SwingImageViewerFactory implements ImageViewerFactory {

	@Override
	public void drawImage() {
		System.out.println("Swing Image Viewer");
	}

}
