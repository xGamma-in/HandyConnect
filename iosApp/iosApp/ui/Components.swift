//
//  Components.swift
//  iosApp
//
//  Created by Alwin Varghese on 13/11/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import Foundation
import SwiftUI

struct GpsNotify : View {
    var body : some View {
        HStack {
            VStack(spacing: 14){
                HStack(spacing: 5){
                    
                    Image(systemName: "mappin.and.ellipse")
                        .foregroundColor(Color(hex: ThemeOrange))
                    
                    Text("Turn on GPS network for locating nearest services.")
                        .font(.system(size: 13, weight: .regular ))
                        .frame(maxWidth: .infinity, alignment: .leading )
                    
                }.frame(alignment: .topLeading)
                .padding(0)
                
                HStack(spacing: 15){
                    Spacer()
                    Button(action: {}){
                        Text("Cancel")
                    }.font(.system(size: 15))
                        .foregroundColor(Color(hex: ThemeMaroon))
                    Button(action: {}){
                        Text("Turn On")
                            .font(.system(size: 15))
                    }
                }
                
            }.padding(.horizontal, 10)
                .padding(.vertical, 10)
                .overlay(
                    RoundedRectangle(cornerRadius: 10)
                        .stroke(Color(hex: ThemeOrange), lineWidth: 0.8)
                )
                .background(Color.white)
                .clipShape(RoundedRectangle(cornerSize: CGSize(width: 10, height: 10)))
            
        }.frame(maxWidth: .infinity)
        .padding(.horizontal, 10)
    }
}

struct GlobalSearch : View {
    @State private var username : String = ""
    var body : some View {
        HStack{
            HStack{
                TextField(
                        "Search for services, electricians....",
                        text: $username
                ).frame(alignment: .leading)
                
                //stack for the search parameters
                HStack(
                    spacing: 10
                ){
                    Image(systemName: "magnifyingglass")
                    Rectangle()
                        .frame(width: 1, height: 30)
                        .foregroundColor(Color(hex: ThemeGrey))
                    Image(systemName: "mic")
                        .resizable()
                        .aspectRatio(contentMode: .fit)
                        .frame(width: 13)
                        .foregroundColor(Color(hex: ThemeOrange))
                    
                }.padding(.trailing, 10)
                
            }
            .padding(EdgeInsets(top: 10, leading: 10, bottom: 10, trailing: 0))
            .overlay(
                        RoundedRectangle(cornerRadius: 10)
                            .stroke(Color(hex: ThemeGrey), lineWidth: 1.2)
                    )
                .background(Color.white)
                .clipShape(RoundedRectangle(cornerSize: CGSize(width: 10, height: 10)))
            
        }.padding(.horizontal, 10)
    }
}

//image slider preview
struct ImageAdPreview : View{
    private let images = ["test_banner","test_banner","test_banner"]
    var body : some View {
        TabView{
            ForEach(images, id: \.self) {item in
                Image(item)
                    .resizable()
                    .aspectRatio(contentMode: .fit)
                    .frame(height: 150)
            }
        }.tabViewStyle(PageTabViewStyle())
            .frame(height: 115)
            .padding(.horizontal, 10)
    }
}
