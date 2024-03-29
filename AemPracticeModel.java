package com.adobe.aem.task.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AemPracticeModel {

	@Inject
	private String imagePath;

	@Inject
	private String isBackground;

	@Inject
	@Named("multifield")
	private List<NavigationItemsModel> navList;

	public String getSubtitle() {
		return imagePath;
	}

	public boolean isBackground() {
		return Boolean.valueOf(isBackground);
	}

	public List<NavigationItemsModel> getNavList() {
		return navList;
	}

}
