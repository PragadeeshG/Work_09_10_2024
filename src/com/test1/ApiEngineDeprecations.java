package com.test1;

public class ApiEngineDeprecations {
	private Integer appEngineCode;
	private Integer deprecationConsoleCode;
	private String deprecationConsoleCodePosition;
	private String deprecationConsoleCodeLength;
	private String consoleTools;
	private String cliTools;
	private boolean apiGatewayEnabled;
	private String totalLambdas;
	private String baseImage;
	private String memory;
	private String cpus;
	private String gpus;
	private String avilabilityZones;
	private String multiRegionSupport;

	public ApiEngineDeprecations() {

	}

	public ApiEngineDeprecations(Integer appEngineCode, Integer deprecationConsoleCode,
			String deprecationConsoleCodePosition, String deprecationConsoleCodeLength, String consoleTools,
			String cliTools, boolean apiGatewayEnabled, String totalLambdas, String baseImage, String memory,
			String cpus, String gpus, String avilabilityZones, String multiRegionSupport) {
		super();
		this.appEngineCode = appEngineCode;
		this.deprecationConsoleCode = deprecationConsoleCode;
		this.deprecationConsoleCodePosition = deprecationConsoleCodePosition;
		this.deprecationConsoleCodeLength = deprecationConsoleCodeLength;
		this.consoleTools = consoleTools;
		this.cliTools = cliTools;
		this.apiGatewayEnabled = apiGatewayEnabled;
		this.totalLambdas = totalLambdas;
		this.baseImage = baseImage;
		this.memory = memory;
		this.cpus = cpus;
		this.gpus = gpus;
		this.avilabilityZones = avilabilityZones;
		this.multiRegionSupport = multiRegionSupport;
	}

	public Integer getAppEngineCode() {
		return appEngineCode;
	}

	public void setAppEngineCode(Integer appEngineCode) {
		this.appEngineCode = appEngineCode;
	}

	public Integer getDeprecationConsoleCode() {
		return deprecationConsoleCode;
	}

	public void setDeprecationConsoleCode(Integer deprecationConsoleCode) {
		this.deprecationConsoleCode = deprecationConsoleCode;
	}

	public String getDeprecationConsoleCodePosition() {
		return deprecationConsoleCodePosition;
	}

	public void setDeprecationConsoleCodePosition(String deprecationConsoleCodePosition) {
		this.deprecationConsoleCodePosition = deprecationConsoleCodePosition;
	}

	public String getDeprecationConsoleCodeLength() {
		return deprecationConsoleCodeLength;
	}

	public void setDeprecationConsoleCodeLength(String deprecationConsoleCodeLength) {
		this.deprecationConsoleCodeLength = deprecationConsoleCodeLength;
	}

	public String getConsoleTools() {
		return consoleTools;
	}

	public void setConsoleTools(String consoleTools) {
		this.consoleTools = consoleTools;
	}

	public String getCliTools() {
		return cliTools;
	}

	public void setCliTools(String cliTools) {
		this.cliTools = cliTools;
	}

	public boolean isApiGatewayEnabled() {
		return apiGatewayEnabled;
	}

	public void setApiGatewayEnabled(boolean apiGatewayEnabled) {
		this.apiGatewayEnabled = apiGatewayEnabled;
	}

	public String getTotalLambdas() {
		return totalLambdas;
	}

	public void setTotalLambdas(String totalLambdas) {
		this.totalLambdas = totalLambdas;
	}

	public String getBaseImage() {
		return baseImage;
	}

	public void setBaseImage(String baseImage) {
		this.baseImage = baseImage;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getCpus() {
		return cpus;
	}

	public void setCpus(String cpus) {
		this.cpus = cpus;
	}

	public String getGpus() {
		return gpus;
	}

	public void setGpus(String gpus) {
		this.gpus = gpus;
	}

	public String getAvilabilityZones() {
		return avilabilityZones;
	}

	public void setAvilabilityZones(String avilabilityZones) {
		this.avilabilityZones = avilabilityZones;
	}

	public String getMultiRegionSupport() {
		return multiRegionSupport;
	}

	public void setMultiRegionSupport(String multiRegionSupport) {
		this.multiRegionSupport = multiRegionSupport;
	}

}
