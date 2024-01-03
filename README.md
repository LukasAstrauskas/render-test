# Render Deployment 

## Web_Test

Runs on [render](https://web-test-on-render.onrender.com).

End points:  
Get request:
- [Hello, Render](https://web-test-on-render.onrender.com).
- [Hello, Jon](https://web-test-on-render.onrender.com/Jon). ... or any other name.

Post request:  
> /sum?array=2,1,1,-5,3,4

Answer is [4,5,7]. Meaning highest sum in array start at index 4, ends at 5 and max sum is 7. 

<details>
<summary>More...</summary>
Jar file made:

In terminal type `/gradlew bootJar`.

Jar file will be made in /build/libs folder.  
Docker file will do the rest.
</details>