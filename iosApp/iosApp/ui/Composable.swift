//
//  Composable.swift
//  iosApp
//
//  Created by Alwin Varghese on 13/11/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import Foundation
import SwiftUI

struct HorizontalTop : View {
    var body : some View {
        HStack(
            spacing: 0
        ){
            VStack(
                alignment: .leading
            ){
                HStack(
                    spacing: 3
                ){
                    Image(systemName: "house.fill")
                        .foregroundColor(Color(hex: "FF8A00"))
                    Text("Home")
                        .font(.system(size: 17, weight: .bold))
                    Menu {
                            Button(action: {}) {
                                Text("H.no 35, RK Layout\n" +
                                     "Jp Nagar, Mysore - 570008")
                                .font(.system(size: 10))
                            }

                            Button(action: {}) {
                                Text("Srivatsa Road, Kuvmpura Puram\n" +
                                     ", Mandya - 345000")
                            }
                        } label: {
                                Image(systemName: "chevron.down")
                                    .foregroundColor(.black)
                        }
                }
                Text("#436, Wall Street, NY, Delhi - 457455")
                    .font(.system(size: 10))
                    .foregroundColor(Color(hex: "787878"))
            }
            Spacer()
            Button(action: {}){
                Text("premium")
                    .padding(.horizontal, 10)
                    .foregroundColor(Color(hex: "FF8A00"))
                    .background(Color.white)
                    .overlay(
                            RoundedRectangle(cornerRadius: 10)
                                .stroke(Color(hex: "FF8A00"), lineWidth: 0.9)
                        )
                    .clipShape(RoundedRectangle(cornerSize: CGSize(width: 10, height: 10)))
            }
        }.padding(.top, 10)
            .padding(.leading, 10)
            .padding(.trailing, 10)
    }
}
