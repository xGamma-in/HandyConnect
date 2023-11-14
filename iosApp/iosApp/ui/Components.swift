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
                        Text("cancel")
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
    @State private var selectedIndex = 0;
    private let images = ["test_banner","test_banner","test_banner"]
    var body : some View {
        TabView(selection: $selectedIndex){
            
            ForEach(images.indices, id: \.self) {index in
                Image(images[index])
                    .resizable()
                    .aspectRatio(contentMode: .fit)
                    .padding(.horizontal,10)
                    .tag(index)
            }
            
        }.frame(height: 110)
            .tabViewStyle(PageTabViewStyle(indexDisplayMode: .always))
//            .indexViewStyle(PageIndexViewStyle(backgroundDisplayMode: .always))
    }
}

//quick access composable
struct QkAccess : View {
    //images lists
    
    private let images = ["quicka1", "quicka2", "quicka3", "quicka4"]
    private let qkData : [ImageObject] = [
        ImageObject(title: "Credits/ \n"+"cards", imageSource: "quicka1"),
        ImageObject(title: "Tranx/ \n"+"history", imageSource: "quicka2"),
        ImageObject(title: "Contact/ \n"+"Support", imageSource: "quicka3"),
        ImageObject(title: "Rate &/ \n"+"review", imageSource: "quicka4")
    ]
    var body : some View {
        
        HStack{
            VStack(spacing: 0){
                
                HStack{
                    Text("Quick Access")
                        .font(.system(size: 15))
                    Spacer()
                }.padding(0)
                
                HStack{
                    Spacer()
                    ForEach(qkData.indices, id: \.self){index in
                        Button(action: {
                            print("Hey tehre")
                        }){
                            VStack(spacing: 0){
                                Image(qkData[index].imageSource)
                                    .resizable()
                                    .aspectRatio(contentMode: .fit)
                                    .frame(width: 40)
                                Text(qkData[index].title)
                                    .padding(0)
                                    .font(.system(size: 15))
                                    .multilineTextAlignment(.center)
                                    .foregroundColor(Color.black)
                            }.padding(0)
                        }
                        Spacer()
                    }
                }.padding(.vertical, 10)
                
            }.padding(.vertical, 8)
                .padding(.horizontal, 10)
                .background(Color.white)
                .overlay(
                            RoundedRectangle(cornerRadius: 10)
                                .stroke(Color(hex: ThemeGrey), lineWidth: 1.2)
                        )
                .clipShape(RoundedRectangle(cornerSize: CGSize(width: 10, height: 10)))
            
        }.frame(width: .infinity)
            .padding(.horizontal, 10)
        
    }
}

//the three buttons
struct ReferallComponent : View {
    
    //here the ref comp structure
    let imageData : [RefCompObject] = [
        RefCompObject(title: "Refer the app", source: "face.smiling"),
        RefCompObject(title: "Benefits today", source: "face.smiling"),
        RefCompObject(title: "More?", source: "face.smiling")
    ]
    
    var body : some View {
        HStack(spacing: 0){
            
            HStack{
                ForEach(imageData.indices, id: \.self) {index in
                    Button(action:{}){
                        
                        VStack(spacing: 4){
                            
                            Image(systemName: imageData[index].source)
                            Text(
                                imageData[index].title
                            ).font(.system(size: 15))
                            
                        }.foregroundColor(Color.white)
                        
                    }.padding(.horizontal, 15)
                    .padding(.vertical, 5)
                    .background(Color(hex: ThemeGreen))
                    .overlay(
                        RoundedRectangle(cornerRadius: 10)
                        .inset(by: 0.15)
                        .stroke(Color(hex: ThemeGrey), lineWidth: 0.3)
                    )
                    .clipShape(RoundedRectangle(cornerRadius: 10))
                    if (index<2) {
                        Spacer()
                    }
                }
                
            }
            
        }.padding(.horizontal, 10)
            .padding(.vertical, 3)
    }
}
