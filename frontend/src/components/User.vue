<template>
    <div>
        <Number
            label="UserId"
            v-model="value.userId"
            :editMode="editMode"
        />
        <String
            label="LoginId"
            v-model="value.loginId"
            :editMode="editMode"
        />
        <String
            label="LoginPassword"
            v-model="value.loginPassword"
            :editMode="editMode"
        />
        <String
            label="Name"
            v-model="value.name"
            :editMode="editMode"
        />
        <String
            label="IsKt"
            v-model="value.isKt"
            :editMode="editMode"
        />
        <String
            label="IsSubscribe"
            v-model="value.isSubscribe"
            :editMode="editMode"
        />
        <Number
            label="PointBalance"
            v-model="value.pointBalance"
            :editMode="editMode"
        />
        <v-divider class="border-opacity-50 my-divider my-2"></v-divider>
        <div variant="outlined" class="my-2">
            <Number
                label="BookId"
                v-model="bookIdInput"
                :editMode="editMode"
                @keydown.enter="addBookIdList"
            />
            <v-card v-if="value.bookId.length > 0" variant="outlined" class="pa-4 mt-2">
                <v-card-sub-title>
                    BookId List
                </v-card-sub-title>
                <li v-for="(name, index) in value.bookId" :key="index">
                    {{ name }}
                </li>
            </v-card>
            <v-row class="ma-0 pa-0 mt-2">
                <v-spacer></v-spacer>
                <v-btn @click="addBookIdList">
                    BookId 추가
                </v-btn>
            </v-row>
            
            <LongDetailGrid
                label="BookId"
                offline
                v-model="value.bookId"
                :editMode="editMode"
                @change="change"
            />
        </div>
        <v-divider class="border-opacity-50 my-divider my-2"></v-divider>
        <Date
            label="SubscriptionDate"
            v-model="value.subscriptionDate"
            :editMode="editMode"
        />
        <v-row class="ma-0 pa-0">
            <v-spacer></v-spacer>
            <v-btn width="64px" color="primary" @click="save">
                저장
            </v-btn>
        </v-row>
    </div>
</template>


<script>
import BaseEntity from './base-ui/BaseEntity.vue'

export default {
    name: 'User',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "users",
        bookIdInput: null,
        value: {
            bookId: [],
        }
    }),
    created(){
    },
    computed:{
    },
    methods: {
        addBookIdList() {
            if (this.bookIdInput !== null && this.bookIdInput !== '') {
                this.value.bookId.push(this.bookIdInput);
                this.bookIdInput = null; // null로 초기화
            }
        },
    },
}
</script>
