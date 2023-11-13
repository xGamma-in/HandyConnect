import SwiftUI
import shared

//to add color codes.
extension Color {
    init(hex: String) {
        var cleanHexCode = hex.trimmingCharacters(in: .whitespacesAndNewlines)
        cleanHexCode = cleanHexCode.replacingOccurrences(of: "#", with: "")
        print(cleanHexCode)
        var rgb: UInt64 = 0
        
        Scanner(string: cleanHexCode).scanHexInt64(&rgb)
        
        let redValue = Double((rgb >> 16) & 0xFF) / 255.0
        let greenValue = Double((rgb >> 8) & 0xFF) / 255.0
        let blueValue = Double(rgb & 0xFF) / 255.0
        self.init(red: redValue, green: greenValue, blue: blueValue)
    }
}

struct ContentView: View {
    var body: some View{
        ZStack(
            alignment: .topLeading
        ){
            LinearGradient(gradient: Gradient(colors: [Color(hex: "FFDEAF"),
                                                       Color(hex: "F8EEFF"),
                                                       .white]),
                           startPoint: .top,
                           endPoint: .bottom)
                .edgesIgnoringSafeArea(/*@START_MENU_TOKEN@*/.all/*@END_MENU_TOKEN@*/)
            Image(systemName: "person.circle")
                .resizable()
                .frame(width: 20, height: 20)
                .padding(.top, 18)
                .padding(.leading, 10 )
            VStack(
                alignment: .leading,
                spacing: 0
            )
            {
                HStack{
                    Spacer()
                    Image(.hcLogo)
                        .resizable()
                        .aspectRatio(contentMode: .fit)
                        .frame(width: 50, height: 50)
                    Spacer()
                }.frame(width: .infinity)
                Rectangle()
                    .frame(height: 0.3)
                    .foregroundColor(.gray)
                    .edgesIgnoringSafeArea(.horizontal)
                ScrollView{
                    VStack(
                        alignment: .leading
                    ){
                        HorizontalTop()
                        GpsNotify()
                    }
                }
            }
        }
    }
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}

struct WeatherTileH: View {
    var dayOfWeek: String
    var imageName: String
    var temperature : Int
    
    var body: some View {
        VStack(spacing: 8){
            Text(dayOfWeek)
                .foregroundColor(.white)
            Image(systemName: imageName)
                .renderingMode(.original)
                .resizable()
                .aspectRatio(contentMode: .fit)
                .frame(width: 32, height: 32            )
            Text("\(temperature)°")
                .foregroundColor(.white)
                .font(.system(size: 28))
        }
    }
}
