package com.test1;

public class ApiEngine {
	private String appEngine;
	private String application;
	private String service;
	private String version;
	private String instance;
	private String applicationRequest;
	private String requestParams;
	private Integer rateLimits;
	private String applicationQuota;
	private String logManager;
	private String status;

	public ApiEngine() {

	}

	public ApiEngine(String appEngine, String application, String service, String version, String instance,
			String applicationRequest, String requestParams, Integer rateLimits, String applicationQuota,
			String logManager, String status) {
		super();
		this.appEngine = appEngine;
		this.application = application;
		this.service = service;
		this.version = version;
		this.instance = instance;
		this.applicationRequest = applicationRequest;
		this.requestParams = requestParams;
		this.rateLimits = rateLimits;
		this.applicationQuota = applicationQuota;
		this.logManager = logManager;
		this.status = status;
	}

	public String getAppEngine() {
		return appEngine;
	}

	public void setAppEngine(String appEngine) {
		this.appEngine = appEngine;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getInstance() {
		return instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
	}

	public String getApplicationRequest() {
		return applicationRequest;
	}

	public void setApplicationRequest(String applicationRequest) {
		this.applicationRequest = applicationRequest;
	}

	public String getRequestParams() {
		return requestParams;
	}

	public void setRequestParams(String requestParams) {
		this.requestParams = requestParams;
	}

	public Integer getRateLimits() {
		return rateLimits;
	}

	public void setRateLimits(Integer rateLimits) {
		this.rateLimits = rateLimits;
	}

	public String getApplicationQuota() {
		return applicationQuota;
	}

	public void setApplicationQuota(String applicationQuota) {
		this.applicationQuota = applicationQuota;
	}

	public String getLogManager() {
		return logManager;
	}

	public void setLogManager(String logManager) {
		this.logManager = logManager;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
