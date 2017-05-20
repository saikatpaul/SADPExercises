package com.sadp.designpattern.exercise1;

public class SWTimageViewerFactory implements ImageViewerFactory {

	@Override
	public void drawImage() {
		System.out.println("SWT Image Viewer");
	}

}
