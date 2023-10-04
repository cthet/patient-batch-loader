package com.demo.springbatch.patientbatchloader.config;

public final class Constants {

	public static final String SPRING_PROFILE_DEVELOPMENT = "dev";

	public static final String SPRING_PROFILE_PRODUCTION = "prod";

    public static final String JOB_PARAM_FILE_NAME = "patient-batch-loader.fileName";

    public static final String STEP_NAME = "process-patients-step";

    public static final String ITEM_READER_NAME = "patient-item-reader";

    private Constants() {
	}
}
