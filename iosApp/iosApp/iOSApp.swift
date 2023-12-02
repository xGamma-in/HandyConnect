import SwiftUI
import FirebaseCore
import FirebaseAuth
import GoogleSignIn

class AppDelegate: NSObject, UIApplicationDelegate {
  func application(_ application: UIApplication,
                   didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey : Any]? = nil) -> Bool {
    FirebaseApp.configure()
    return true
  }
   func application(_ app: UIApplication,
                     open url: URL,
                     options: [UIApplication.OpenURLOptionsKey: Any] = [:]) -> Bool {
      return GIDSignIn.sharedInstance.handle(url)
   }
}

@main
struct iOSApp: App {
    @UIApplicationDelegateAdaptor(AppDelegate.self) var delegate
	var body: some Scene {
		WindowGroup {
//			ContentView()
            LoginTest()
		}
	}
}

//login class
//class SignInViewModel : ObservableObject {
//    func signInWithGoogle() {
//        guard let clientID = FirebaseApp.app()?.options.clientID else { return }
//            // Create Google Sign In configuration object.
//            let config = GIDConfiguration(clientID: clientID)
//            GIDSignIn.sharedInstance.configuration = config
//
//            // Start the sign in flow!
//            GIDSignIn.sharedInstance.signIn(withPresenting: UIApplication.shared.windows.first?.rootViewController) { [weak self] result, error in
//                guard error == nil else {
//                    // Handle error
//                    return
//                }
//
//                guard let user = result?.user,
//                    let idToken = user.idToken?.tokenString else {
//                    // Handle error
//                    return
//                }
//
//                let credential = GoogleAuthProvider.credential(withIDToken: idToken, accessToken: user.accessToken.tokenString)
//                // Use the credential to sign in to Firebase
//                // ...
//        }
//    }
//}

//test login button
struct LoginTest : View {
    var body : some View {
        Button(action: {
            print("Hey there")
        }){
            Text("Hey there")
        }
    }
}
