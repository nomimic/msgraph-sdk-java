// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed Device Mobile App Configuration.
 */
public class BaseManagedDeviceMobileAppConfiguration extends Entity implements IJsonBackedObject {


    /**
     * The Targeted Mobile Apps.
     * the associated app.
     */
    @SerializedName("targetedMobileApps")
    @Expose
    public java.util.List<String> targetedMobileApps;

    /**
     * The Created Date Time.
     * DateTime the object was created.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * Admin provided description of the Device Configuration.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Last Modified Date Time.
     * DateTime the object was last modified.
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Display Name.
     * Admin provided name of the device configuration.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Version.
     * Version of the device configuration.
     */
    @SerializedName("version")
    @Expose
    public Integer version;

    /**
     * The Assignments.
     * The list of group assignemenets for app configration.
     */
    public ManagedDeviceMobileAppConfigurationAssignmentCollectionPage assignments;

    /**
     * The User Statuses.
     * List of ManagedDeviceMobileAppConfigurationUserStatus.
     */
    public ManagedDeviceMobileAppConfigurationUserStatusCollectionPage userStatuses;

    /**
     * The Device Status Summary.
     * App configuration device status summary.
     */
    @SerializedName("deviceStatusSummary")
    @Expose
    public ManagedDeviceMobileAppConfigurationDeviceSummary deviceStatusSummary;

    /**
     * The User Status Summary.
     * App configuration user status summary.
     */
    @SerializedName("userStatusSummary")
    @Expose
    public ManagedDeviceMobileAppConfigurationUserSummary userStatusSummary;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("assignments")) {
            final BaseManagedDeviceMobileAppConfigurationAssignmentCollectionResponse response = new BaseManagedDeviceMobileAppConfigurationAssignmentCollectionResponse();
            if (json.has("assignments@odata.nextLink")) {
                response.nextLink = json.get("assignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("assignments").toString(), JsonObject[].class);
            final ManagedDeviceMobileAppConfigurationAssignment[] array = new ManagedDeviceMobileAppConfigurationAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedDeviceMobileAppConfigurationAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            assignments = new ManagedDeviceMobileAppConfigurationAssignmentCollectionPage(response, null);
        }

        if (json.has("userStatuses")) {
            final BaseManagedDeviceMobileAppConfigurationUserStatusCollectionResponse response = new BaseManagedDeviceMobileAppConfigurationUserStatusCollectionResponse();
            if (json.has("userStatuses@odata.nextLink")) {
                response.nextLink = json.get("userStatuses@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("userStatuses").toString(), JsonObject[].class);
            final ManagedDeviceMobileAppConfigurationUserStatus[] array = new ManagedDeviceMobileAppConfigurationUserStatus[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedDeviceMobileAppConfigurationUserStatus.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            userStatuses = new ManagedDeviceMobileAppConfigurationUserStatusCollectionPage(response, null);
        }
    }
}
