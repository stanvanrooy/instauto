# Setting up a development environment
Setting up a development environment is relatively simple. The development environment is used for 
watching/intercepting HTTPS requests made by the Instagram app.

How we achieve this, is by connecting your phone to a proxy (i.e. mitmproxy), but out of the box, this won't
 work, because of SSL pinning built in to the Instagram app.

This only works on Android phones.

## Steps
1. **Install the Instagram app** Download the APK from [here](https://github.com/itsMoji/Instagram_SSL_Pinning). You can ignore the warning, from my testing all proxies work.
2. **Install a proxy** I.e. mitmproxy, burp, fiddler.
3. **Setup the proxy on your phone** Out of the box, most Android phones support proxies, but they will only be used for connections
through the browser. Use an app like [Postern](https://play.google.com/store/apps/details?id=com.tunnelworkshop.postern), which pretends
to be a VPN and thus is able to route all traffic through the proxy.

Once connected to the proxy, open the Instagram app and you should see the requests start flowing in.

If you get stuck somewhere, feel free to [contact me](mail:stan@rooy.dev). I'm happy to assist.