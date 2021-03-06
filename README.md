
# react-native-video-compression

## Getting started

`$ npm install react-native-video-compression --save`

### Mostly automatic installation

`$ react-native link react-native-video-compression`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-video-compression` and add `RNVideoCompression.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNVideoCompression.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNVideoCompressionPackage;` to the imports at the top of the file
  - Add `new RNVideoCompressionPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-video-compression'
  	project(':react-native-video-compression').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-video-compression/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-video-compression')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNVideoCompression.sln` in `node_modules/react-native-video-compression/windows/RNVideoCompression.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Video.Compression.RNVideoCompression;` to the usings at the top of the file
  - Add `new RNVideoCompressionPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNVideoCompression from 'react-native-video-compression';

RNVideoCompression.getCompressedFile(videofilePath)
.then(res => console.log(res))

It will print compressed video file path.
```
  
