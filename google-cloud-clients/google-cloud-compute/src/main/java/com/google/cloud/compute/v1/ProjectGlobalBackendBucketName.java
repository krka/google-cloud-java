/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameFactory;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

@Generated("by GAPIC")
@BetaApi
public final class ProjectGlobalBackendBucketName implements ResourceName {
  private final String backendBucket;
  private final String project;
  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("{project}/global/backendBuckets/{backendBucket}");

  public static final String SERVICE_ADDRESS = "https://www.googleapis.com/compute/v1/projects/";

  private volatile Map<String, String> fieldValuesMap;

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private ProjectGlobalBackendBucketName(Builder builder) {
    backendBucket = Preconditions.checkNotNull(builder.getBackendBucket());
    project = Preconditions.checkNotNull(builder.getProject());
  }

  public static ProjectGlobalBackendBucketName of(String backendBucket, String project) {
    return newBuilder().setBackendBucket(backendBucket).setProject(project).build();
  }

  public static String format(String backendBucket, String project) {
    return of(backendBucket, project).toString();
  }

  public String getBackendBucket() {
    return backendBucket;
  }

  public String getProject() {
    return project;
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("backendBucket", backendBucket);
          fieldMapBuilder.put("project", project);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  public static ResourceNameFactory<ProjectGlobalBackendBucketName> newFactory() {
    return new ResourceNameFactory<ProjectGlobalBackendBucketName>() {
      public ProjectGlobalBackendBucketName parse(String formattedString) {
        return ProjectGlobalBackendBucketName.parse(formattedString);
      }
    };
  }

  public static ProjectGlobalBackendBucketName parse(String formattedString) {
    String resourcePath = formattedString;
    if (formattedString.startsWith(SERVICE_ADDRESS)) {
      resourcePath = formattedString.substring(SERVICE_ADDRESS.length());
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            resourcePath,
            "ProjectGlobalBackendBucketName.parse: formattedString not in valid format");
    return of(matchMap.get("backendBucket"), matchMap.get("project"));
  }

  public static boolean isParsableFrom(String formattedString) {
    String resourcePath = formattedString;
    if (formattedString.startsWith(SERVICE_ADDRESS)) {
      resourcePath = formattedString.substring(SERVICE_ADDRESS.length());
    }
    return PATH_TEMPLATE.matches(resourcePath);
  }

  public static class Builder {
    private String backendBucket;
    private String project;

    public String getBackendBucket() {
      return backendBucket;
    }

    public String getProject() {
      return project;
    }

    public Builder setBackendBucket(String backendBucket) {
      this.backendBucket = backendBucket;
      return this;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    private Builder() {}

    public Builder(ProjectGlobalBackendBucketName projectGlobalBackendBucketName) {
      backendBucket = projectGlobalBackendBucketName.backendBucket;
      project = projectGlobalBackendBucketName.project;
    }

    public ProjectGlobalBackendBucketName build() {
      return new ProjectGlobalBackendBucketName(this);
    }
  }

  @Override
  public String toString() {
    return SERVICE_ADDRESS
        + PATH_TEMPLATE.instantiate(
            "backendBucket", backendBucket,
            "project", project);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ProjectGlobalBackendBucketName) {
      ProjectGlobalBackendBucketName that = (ProjectGlobalBackendBucketName) o;
      return Objects.equals(this.backendBucket, that.getBackendBucket())
          && Objects.equals(this.project, that.getProject());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(backendBucket, project);
  }
}
