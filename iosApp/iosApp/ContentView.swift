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
        ZStack{
            LinearGradient(gradient: Gradient(colors: [Color(hex: "FFDEAF"),
                                                       Color(hex: "000000")]),
                           startPoint: .top,
                           endPoint: .bottom)
                .edgesIgnoringSafeArea(/*@START_MENU_TOKEN@*/.all/*@END_MENU_TOKEN@*/)
            VStack{
                Text("Cupertino, CA")
                    .font(.system(size: 32, weight: .bold))
                    .foregroundColor(.white)
                    .padding()
                VStack(
                    spacing: 8
                ){
                    Image(systemName: "cloud.sun.fill")
                        .renderingMode(.original)
                        .resizable()
                        .aspectRatio(contentMode: .fit)
                        .frame(width: 180 ,height: 180)
                    Text("76°")
                        .font(.system(size: 70, weight: .medium))
                        .foregroundColor(.white)
                }
                .padding(.bottom, 40)
                HStack(
                    spacing: 30
                ){
                    WeatherTileH(dayOfWeek: "TUE", imageName: "cloud.sun.fill", temperature: 74)
                    WeatherTileH(dayOfWeek: "WED", imageName: "sun.horizon.fill", temperature: 74)
                    WeatherTileH(dayOfWeek: "THU", imageName: "moon.fill", temperature: 74)
                    WeatherTileH(dayOfWeek: "FRI", imageName: "sun.dust.fill", temperature: 74)
                    WeatherTileH(dayOfWeek: "SAT", imageName: "cloud.sun.fill", temperature: 74)
                }
                Spacer()
                
                Button{
                    print("tapped")
                } label: {
                    Text("Change Day Time")
                        .frame(width: 280, height: 50)
                        .background(Color.white)
                        .font(.system(size: 20, weight: .medium, design: .default))
                        .clipShape(RoundedRectangle(cornerSize: CGSize(width: 10, height: 10)))
                }
                Spacer()
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
