import SwiftUI
import Shared

struct ContentView: View {
    @State private var nickname = com.daveleeds.swiftexport.Nickname.Companion.shared.Default
    
    let service = com.daveleeds.swiftexport.NicknameService()
    
    var body: some View {
        VStack {
            Button("Generate username") {
                nickname = service.generateRandomNickname()
            }
            
            VStack(spacing: 16) {
                Spacer()
                Text(nickname.toString()).font(.largeTitle)
                Spacer()
            }
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
        .padding()
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
