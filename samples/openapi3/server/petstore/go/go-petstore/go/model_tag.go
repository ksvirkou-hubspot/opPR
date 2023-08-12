/*
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package petstoreserver




// Tag - A tag for a pet
type Tag struct {

	Id int64 `json:"id,omitempty"`

	Name string `json:"name,omitempty"`
}

// AssertTagRequired checks if the required fields are not zero-ed
func AssertTagRequired(obj Tag) error {
	return nil
}

// AssertTagConstraints checks if the values respects the defined constraints
func AssertTagConstraints(obj Tag) error {
	return nil
}