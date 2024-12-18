import SwiftUI
import NicknameShared

struct ContentView: View {
    @State private var nickname = Nickname.companion.Default
    
    let service = NicknameService()
    
    var body: some View {
        VStack {
            Button("Generate username") {
                nickname = service.generateRandomNickname()
            }
            
            VStack(spacing: 16) {
                Spacer()
                Text(nickname.description()).font(.largeTitle)
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
