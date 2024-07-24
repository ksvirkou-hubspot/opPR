/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

/**
* Describes the result of uploading an image resource
*/
export class ApiResponse {
    'code'?: number;
    'type'?: string;
    'message'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: any} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "code",
            "baseName": "code",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "string",
            "format": ""
        },
        {
            "name": "message",
            "baseName": "message",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ApiResponse.attributeTypeMap;
    }

    public constructor() {
    }
}
