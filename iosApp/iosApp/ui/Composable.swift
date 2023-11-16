//
//  Composable.swift
//  iosApp
//
//  Created by Alwin Varghese on 13/11/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import Foundation
import SwiftUI

//home page UI
struct HomeFlow : View {
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
                        GlobalSearch()
                        GpsNotify()
                        ImageAdPreview()
                        QkAccess()
                        ReferallComponent()
                    }
                }
            }
        }
    }
}

//Login Flow Page
struct LoginFlow : View {
    var body : some View {
        VStack{
            Spacer()
            VStack{
                Image(.loginFlowLogo)
                    .resizable()
                    .aspectRatio(contentMode: .fit)
                    .frame(width: 150)
                HStack{
                    Button(action:{}){
                        HStack(spacing: 10){
                            Image(.loginGoogleLogo)
                                .resizable()
                                .aspectRatio(contentMode: .fit)
                                .frame(width: 25)
                            Text("Sign in with Google account")
                                .foregroundColor(Color.black)
                            
                        }.padding(.horizontal, 15)
                            .padding(.vertical, 10)
                            .overlay(
                                RoundedRectangle(cornerRadius: 30)
                                    .stroke(Color(hex: ThemeGrey), lineWidth: 0.9)
                            )
                            .clipShape(RoundedRectangle(cornerRadius: 30))
                    }
                    
                }.padding(.top, 15)
            }
            Spacer()
            VStack(spacing: 10){
                Text("Contest submission for")
                    .font(.system(size: 15))
                Image(.kConf2024)
                    .resizable()
                    .aspectRatio(contentMode: .fit)
                    .frame(width: 270)
                    .grayscale(1.0)
            }.padding(0)
        }
    }
}
