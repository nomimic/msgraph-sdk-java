// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
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
 * The class for the Base Schema Extension.
 */
public class BaseSchemaExtension extends Entity implements IJsonBackedObject {


    public BaseSchemaExtension() {
        oDataType = "microsoft.graph.schemaExtension";
    }

    /**
     * The Description.
	 * Description for the schema extension.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Target Types.
	 * Set of Microsoft Graph types (that can support extensions) that the schema extension can be applied to. Select from contact, device, event, group, message, organization, post, or user.
     */
    @SerializedName("targetTypes")
    @Expose
    public java.util.List<String> targetTypes;

    /**
     * The Properties.
	 * The collection of property names and types that make up the schema extension definition.
     */
    @SerializedName("properties")
    @Expose
    public java.util.List<ExtensionSchemaProperty> properties;

    /**
     * The Status.
	 * The lifecycle state of the schema extension. Possible states are InDevelopment, Available, and Deprecated. Automatically set to InDevelopment on creation. Schema extensions provides more information on the possible state transitions and behaviors.
     */
    @SerializedName("status")
    @Expose
    public String status;

    /**
     * The Owner.
	 * The appId of the application that created the schema extension. Read-only.
     */
    @SerializedName("owner")
    @Expose
    public String owner;


    /**
     * The raw representation of this class
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer
     */
    private transient ISerializer mSerializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;

    }
}