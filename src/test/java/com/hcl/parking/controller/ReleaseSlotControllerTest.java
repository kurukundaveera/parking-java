package com.hcl.parking.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.hcl.parking.service.ReleaseSlotService;

@RunWith(MockitoJUnitRunner.class)
public class ReleaseSlotControllerTest {
	@Mock
	ReleaseSlotService releaseSlotService;
	
	@InjectMocks
	ReleaseSlotController releaseSlotController;
	MockMvc mockMvc;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(releaseSlotController).build();
	}

	@Test
	public void testReleaseSlot() {
	}

}
