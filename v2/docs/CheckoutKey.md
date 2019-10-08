

# CheckoutKey

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**publicKey** | **String** | A public SSH key. | 
**type** | [**TypeEnum**](#TypeEnum) | The type of checkout key. This may be either &#x60;deploy-key&#x60; or &#x60;github-user-key&#x60;. | 
**fingerprint** | **String** | An SSH key fingerprint. | 
**preferred** | **Boolean** | A boolean value that indicates if this key is preferred. | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the checkout key was created. | 



## Enum: TypeEnum

Name | Value
---- | -----
DEPLOY_KEY | &quot;deploy-key&quot;
GITHUB_USER_KEY | &quot;github-user-key&quot;



