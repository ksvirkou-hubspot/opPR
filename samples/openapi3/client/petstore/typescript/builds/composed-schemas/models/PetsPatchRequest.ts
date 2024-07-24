/**
 * Example
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Cat } from '../models/Cat';
import { Dog } from '../models/Dog';
import { HttpFile } from '../http/http';

/**
 * @type PetsPatchRequest
 * Type
 * @export
 */
export type PetsPatchRequest = Cat | Dog;

/**
* @type PetsPatchRequestClass
* @export
*/
export class PetsPatchRequestClass {
    static readonly discriminator: string | undefined = "petType";

    static readonly mapping: {[index: string]: any} | undefined = undefined;
}

